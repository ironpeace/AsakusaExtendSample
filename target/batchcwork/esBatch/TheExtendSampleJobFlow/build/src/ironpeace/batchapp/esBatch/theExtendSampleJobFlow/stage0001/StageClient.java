package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.stage0001;
import com.asakusafw.runtime.stage.AbstractStageClient;
import com.asakusafw.runtime.stage.StageInput;
import com.asakusafw.runtime.stage.StageOutput;
import com.asakusafw.runtime.stage.StageResource;
import com.asakusafw.runtime.stage.input.BridgeInputFormat;
import com.asakusafw.runtime.stage.output.TemporaryOutputFormat;
import ironpeace.modelgen.dmdl.model.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.io.NullWritable;
/**
 * ステージ1のジョブを実行するクライアント。
 */
public final class StageClient extends AbstractStageClient {
    @Override protected String getBatchId() {
        return "esBatch";
    }
    @Override protected String getFlowId() {
        return "TheExtendSampleJobFlow";
    }
    @Override protected String getStageId() {
        return "stage0001";
    }
    @Override protected String getStageOutputPath() {
        return "target/hadoopwork/${execution_id}/esBatch/TheExtendSampleJobFlow/stage0001";
    }
    @Override protected List<StageInput> getStageInputs() {
        List<StageInput> results = new ArrayList<StageInput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        attributes.put("basePath", "ironpeace/input/");
        attributes.put("resourcePath", "originaldata.csv");
        attributes.put("dataClass", "ironpeace.modelgen.dmdl.model.OriginalData");
        attributes.put("formatClass", "ironpeace.modelgen.dmdl.csv.OriginalDataCsvFormat");
        results.add(new StageInput("__DIRECTIO__/orignaldata/ironpeace/input", BridgeInputFormat.class, StageMapper1.
                class, attributes));
        return results;
    }
    @Override protected List<StageOutput> getStageOutputs() {
        List<StageOutput> results = new ArrayList<StageOutput>();
        results.add(new StageOutput("result0", NullWritable.class, Result.class, TemporaryOutputFormat.class));
        return results;
    }
    @Override protected List<StageResource> getStageResources() {
        List<StageResource> results = new ArrayList<StageResource>();
        return results;
    }
}