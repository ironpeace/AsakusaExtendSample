package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.OriginalData;
/**
 * An abstract implementation of {@link OriginalData} importer description using Direct I/O CSV.
 */
public abstract class AbstractOriginalDataCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends OriginalData> getModelType() {
        return OriginalData.class;
    }
    @Override public Class<OriginalDataCsvFormat> getFormat() {
        return OriginalDataCsvFormat.class;
    }
}