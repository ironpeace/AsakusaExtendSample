package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.operator.Convert;
import ironpeace.modelgen.dmdl.model.PreResult;
import ironpeace.modelgen.dmdl.model.Result;
import javax.annotation.Generated;
/**
 * {@link ExtendSampleOperator}に関する演算子ファクトリークラス。
 * @see ExtendSampleOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1") public class ExtendSampleOperatorFactory {
    /**
     */
    public static final class ConvertedResult implements Operator {
        private final FlowElementResolver $;
        /**
         * 入力された内容
         */
        public final Source<PreResult> original;
        /**
         */
        public final Source<Result> out;
        ConvertedResult(Source<PreResult> pre) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(Convert.class);
            builder.declare(ExtendSampleOperator.class, ExtendSampleOperatorImpl.class, "convertedResult");
            builder.declareParameter(PreResult.class);
            builder.addInput("pre", pre);
            builder.addOutput("original", pre);
            builder.addOutput("out", Result.class);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("pre", pre);
            this.original = this.$.resolveOutput("original");
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public ExtendSampleOperatorFactory.ConvertedResult as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param pre
     * @return 生成した演算子オブジェクト
     * @see ExtendSampleOperator#convertedResult(PreResult)
     */
    public ExtendSampleOperatorFactory.ConvertedResult convertedResult(Source<PreResult> pre) {
        return new ExtendSampleOperatorFactory.ConvertedResult(pre);
    }
}