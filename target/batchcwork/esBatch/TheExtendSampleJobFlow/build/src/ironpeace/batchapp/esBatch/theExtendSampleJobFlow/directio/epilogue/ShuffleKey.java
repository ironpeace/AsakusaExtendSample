package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.ResultCsvFormat;
import ironpeace.modelgen.dmdl.model.Result;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(Result.class, "ironpeace/output/", ResultCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}