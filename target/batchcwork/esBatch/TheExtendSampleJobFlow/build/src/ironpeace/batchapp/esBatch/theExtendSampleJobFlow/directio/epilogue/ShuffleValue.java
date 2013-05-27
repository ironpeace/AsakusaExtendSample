package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputValue;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.ResultCsvFormat;
import ironpeace.modelgen.dmdl.model.Result;
/**
 */
public final class ShuffleValue extends AbstractDirectOutputValue {
    /**
     * Creates a new instance.
     */
    public ShuffleValue() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(Result.class, "ironpeace/output/", ResultCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}