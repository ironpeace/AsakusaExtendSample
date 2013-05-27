package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.OriginalData;
import ironpeace.modelgen.dmdl.model.PreResult;
import ironpeace.modelgen.dmdl.model.Result;
import ironpeace.operator.ExtendSampleOperatorFactory;
import ironpeace.operator.ExtendSampleOperatorFactory.ConvertedResult;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory.Extend;

@JobFlow(name="TheExtendSampleJobFlow")
public class ExtendSampleJobFlow extends FlowDescription {
	
	final In<OriginalData> originaldata;
	final Out<Result> result;
	final CoreOperatorFactory coreOp = new CoreOperatorFactory();
	
	public ExtendSampleJobFlow(
			@Import(name="orignaldata", description=OriginaldataFromCsv.class)
			In<OriginalData> originaldata,
			@Export(name="result", description=ResultToCsv.class)
			Out<Result> result
			) {
		this.originaldata = originaldata;
		this.result = result;
	}

	@Override
	protected void describe() {
		ExtendSampleOperatorFactory operators
			= new ExtendSampleOperatorFactory();
		
		Extend<PreResult> preresult
			= coreOp.extend(originaldata, PreResult.class);
		
		ConvertedResult convertedResult
			= operators.convertedResult(preresult);
		coreOp.stop(convertedResult.original);
		
		result.add(convertedResult.out);
	}

}
