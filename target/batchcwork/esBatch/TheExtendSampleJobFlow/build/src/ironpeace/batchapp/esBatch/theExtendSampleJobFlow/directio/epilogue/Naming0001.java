package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.Result;
/**
 * A naming output "result" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "result.csv"));
    }
    @Override public void set(Object rawObject) {
        Result object = (Result) rawObject;
    }
}