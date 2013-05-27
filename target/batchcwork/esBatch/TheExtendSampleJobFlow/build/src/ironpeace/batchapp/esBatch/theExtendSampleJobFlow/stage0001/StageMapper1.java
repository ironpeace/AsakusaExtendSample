package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import com.asakusafw.runtime.flow.VoidResult;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.modelgen.dmdl.model.PreResult;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code [in->extend(operator#2144898487){owner=FlowBlock&#64;1009042595}]}の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper1 extends Mapper<NullWritable, OriginalData, NullWritable
        , NullWritable> {
    private OriginalData cache = new OriginalData();
    private RuntimeResourceManager runtimeResourceManager;
    private StageOutputDriver outputs;
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        this.outputs = new StageOutputDriver(context);
        final Result<ironpeace.modelgen.dmdl.model.Result> output = outputs.getResultSink("result0");
        this.line = new MapFragment1(new VoidResult<PreResult>(), output);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.outputs.close();
        this.outputs = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}