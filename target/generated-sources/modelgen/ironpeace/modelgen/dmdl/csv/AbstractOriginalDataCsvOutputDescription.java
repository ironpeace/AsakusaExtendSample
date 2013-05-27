package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 * An abstract implementation of {@link OriginalData} exporter description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends OriginalData> getModelType() {
        return OriginalData.class;
    }
    @Override public Class<OriginalDataCsvFormat> getFormat() {
        return OriginalDataCsvFormat.class;
    }
}