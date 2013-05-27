package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.Result;
/**
 * An abstract implementation of {@link Result} importer description using Direct I/O CSV.
 */
public abstract class AbstractResultCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends Result> getModelType() {
        return Result.class;
    }
    @Override public Class<ResultCsvFormat> getFormat() {
        return ResultCsvFormat.class;
    }
}