package ironpeace.batch;

import ironpeace.jobflow.ExtendSampleJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="esBatch")
public class ExtendSampleBatch extends BatchDescription {

	@Override
	protected void describe() {
		run(ExtendSampleJobFlow.class).soon();
	}

}
