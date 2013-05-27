package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.PreResult;
import ironpeace.modelgen.dmdl.model.Result;

import com.asakusafw.vocabulary.operator.Convert;


public abstract class ExtendSampleOperator {

	@Convert
	public Result convertedResult(PreResult pre){
		Result result = new Result();
		result.setMid1(pre.getData1() + pre.getData2());
		result.setMid2(pre.getData2() + pre.getData3());
		
		if(result.getMid1() > pre.getData3()){
			result.setAlert1AsString("A");
		}else{
			result.setAlert1AsString("B");
		}

		if(result.getMid2() > pre.getData1()){
			result.setAlert2AsString("A");
		}else{
			result.setAlert2AsString("B");
		}
		
		return result;
	}

}
