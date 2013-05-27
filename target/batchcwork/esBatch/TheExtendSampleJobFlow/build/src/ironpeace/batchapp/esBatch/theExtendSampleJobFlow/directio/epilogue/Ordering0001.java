package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import ironpeace.modelgen.dmdl.model.Result;
/**
 * An ordering output "result" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        Result object = (Result) rawObject;
    }
}