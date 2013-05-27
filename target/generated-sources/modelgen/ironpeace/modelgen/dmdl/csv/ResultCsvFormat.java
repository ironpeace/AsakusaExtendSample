package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.runtime.directio.BinaryStreamFormat;
import com.asakusafw.runtime.directio.util.DelimiterRangeInputStream;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.csv.CsvConfiguration;
import com.asakusafw.runtime.io.csv.CsvEmitter;
import com.asakusafw.runtime.io.csv.CsvParser;
import ironpeace.modelgen.dmdl.model.Result;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/**
 * CSV format for {@link Result}.
 */
public final class ResultCsvFormat extends BinaryStreamFormat<Result> {
    /**
     * Returns this CSV format configuration.
     * @param head whether configure for head of file or not
     * @return CSV format configuration
     */
    protected CsvConfiguration getConfiguration(boolean head) {
        List<String> headers = new ArrayList<String>();
        if(head) {
            headers.add("keycode");
            headers.add("data1");
            headers.add("data2");
            headers.add("data3");
            headers.add("mid1");
            headers.add("mid2");
            headers.add("alert1");
            headers.add("alert2");
        }
        CsvConfiguration config = new CsvConfiguration(Charset.forName("UTF-8"), headers, "true", "false", "yyyy-MM-dd", 
                "yyyy-MM-dd HH:mm:ss");
        config.setLineBreakInValue(false);
        return config;
    }
    @Override public Class<Result> getSupportedType() {
        return Result.class;
    }
    @Override public long getPreferredFragmentSize() {
        return -1L;
    }
    @Override public long getMinimumFragmentSize() {
        return Long.MAX_VALUE;
    }
    @Override public ModelInput<Result> createInput(Class<? extends Result> dataType, String path, InputStream stream, 
            long offset, long fragmentSize) throws IOException {
        if(dataType == null) {
            throw new IllegalArgumentException("dataType must not be null");
        }
        if(path == null) {
            throw new IllegalArgumentException("path must not be null");
        }
        if(stream == null) {
            throw new IllegalArgumentException("stream must not be null");
        }
        InputStream fragmentInput;
        fragmentInput = new DelimiterRangeInputStream(stream, '\n', fragmentSize, offset > 0L);
        CsvParser parser = new CsvParser(fragmentInput, path, this.getConfiguration(offset == 0L));
        return new Reader(parser);
    }
    @Override public ModelOutput<Result> createOutput(Class<? extends Result> dataType, String path, OutputStream stream
            ) throws IOException {
        if(path == null) {
            throw new IllegalArgumentException("path must not be null");
        }
        if(stream == null) {
            throw new IllegalArgumentException("stream must not be null");
        }
        CsvEmitter emitter = new CsvEmitter(stream, path, this.getConfiguration(true));
        return new Writer(emitter);
    }
    private static final class Reader implements ModelInput<Result> {
        private final CsvParser parser;
        Reader(CsvParser parser) {
            this.parser = parser;
        }
        @Override public boolean readTo(Result object) throws IOException {
            if(parser.next() == false) {
                return false;
            }
            parser.fill(object.getKeycodeOption());
            parser.fill(object.getData1Option());
            parser.fill(object.getData2Option());
            parser.fill(object.getData3Option());
            parser.fill(object.getMid1Option());
            parser.fill(object.getMid2Option());
            parser.fill(object.getAlert1Option());
            parser.fill(object.getAlert2Option());
            parser.endRecord();
            return true;
        }
        @Override public void close() throws IOException {
            parser.close();
        }
    }
    private static final class Writer implements ModelOutput<Result> {
        private final CsvEmitter emitter;
        Writer(CsvEmitter emitter) {
            this.emitter = emitter;
        }
        @Override public void write(Result object) throws IOException {
            emitter.emit(object.getKeycodeOption());
            emitter.emit(object.getData1Option());
            emitter.emit(object.getData2Option());
            emitter.emit(object.getData3Option());
            emitter.emit(object.getMid1Option());
            emitter.emit(object.getMid2Option());
            emitter.emit(object.getAlert1Option());
            emitter.emit(object.getAlert2Option());
            emitter.endRecord();
        }
        @Override public void close() throws IOException {
            emitter.close();
        }
    }
}