package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.Result;
/**
 * An abstract implementation of {@link Result} exporter description using Direct I/O CSV.
 */
public abstract class AbstractResultCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends Result> getModelType() {
        return Result.class;
    }
    @Override public Class<ResultCsvFormat> getFormat() {
        return ResultCsvFormat.class;
    }
}