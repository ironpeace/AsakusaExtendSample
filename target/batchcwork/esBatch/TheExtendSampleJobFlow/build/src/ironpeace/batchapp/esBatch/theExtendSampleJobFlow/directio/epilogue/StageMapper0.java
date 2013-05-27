package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import ironpeace.modelgen.dmdl.model.Result;
/**
 */
public final class StageMapper0 extends AbstractDirectOutputMapper<Result> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}