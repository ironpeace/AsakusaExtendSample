package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.modelgen.dmdl.model.PreResult;
import ironpeace.operator.ExtendSampleOperatorImpl;
/**
 * {@code [in->extend(operator#2144898487)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<OriginalData> {
    private final Result<PreResult> original;
    private final Result<ironpeace.modelgen.dmdl.model.Result> out;
    private PreResult cache = new PreResult();
    private ExtendSampleOperatorImpl op = new ExtendSampleOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param original {@code ExtendSampleOperator.convertedResult#original}への出力
     * @param out {@code ExtendSampleOperator.convertedResult#out}への出力
     */
    public MapFragment1(Result<PreResult> original, Result<ironpeace.modelgen.dmdl.model.Result> out) {
        this.original = original;
        this.out = out;
    }
    @Override public void add(OriginalData result) {
        this.cache.reset();
        this.cache.setData1Option(result.getData1Option());
        this.cache.setKeycodeOption(result.getKeycodeOption());
        this.cache.setData2Option(result.getData2Option());
        this.cache.setData3Option(result.getData3Option());
        ironpeace.modelgen.dmdl.model.Result v = this.op.convertedResult(this.cache);
        this.original.add(this.cache);
        this.out.add(v);
    }
}