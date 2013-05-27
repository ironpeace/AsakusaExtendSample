package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.LongOption;
import ironpeace.modelgen.dmdl.io.OriginalDataInput;
import ironpeace.modelgen.dmdl.io.OriginalDataOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Writable;
/**
 * OriginalDataを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(OriginalDataInput.class)@ModelOutputLocation(OriginalDataOutput.class)@
        PropertyOrder({"keycode", "data1", "data2", "data3"}) public class OriginalData implements DataModel<
        OriginalData>, Writable {
    private final IntOption keycode = new IntOption();
    private final LongOption data1 = new LongOption();
    private final LongOption data2 = new LongOption();
    private final LongOption data3 = new LongOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.data1.setNull();
        this.data2.setNull();
        this.data3.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(OriginalData other) {
        this.keycode.copyFrom(other.keycode);
        this.data1.copyFrom(other.data1);
        this.data2.copyFrom(other.data2);
        this.data3.copyFrom(other.data3);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public int getKeycode() {
        return this.keycode.get();
    }
    /**
     * keycodeを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycode(int value) {
        this.keycode.modify(value);
    }
    /**
     * <code>null</code>を許すkeycodeを返す。
     * @return keycode
     */
    public IntOption getKeycodeOption() {
        return this.keycode;
    }
    /**
     * keycodeを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setKeycodeOption(IntOption option) {
        this.keycode.copyFrom(option);
    }
    /**
     * data1を返す。
     * @return data1
     * @throws NullPointerException data1の値が<code>null</code>である場合
     */
    public long getData1() {
        return this.data1.get();
    }
    /**
     * data1を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData1(long value) {
        this.data1.modify(value);
    }
    /**
     * <code>null</code>を許すdata1を返す。
     * @return data1
     */
    public LongOption getData1Option() {
        return this.data1;
    }
    /**
     * data1を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData1Option(LongOption option) {
        this.data1.copyFrom(option);
    }
    /**
     * data2を返す。
     * @return data2
     * @throws NullPointerException data2の値が<code>null</code>である場合
     */
    public long getData2() {
        return this.data2.get();
    }
    /**
     * data2を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData2(long value) {
        this.data2.modify(value);
    }
    /**
     * <code>null</code>を許すdata2を返す。
     * @return data2
     */
    public LongOption getData2Option() {
        return this.data2;
    }
    /**
     * data2を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData2Option(LongOption option) {
        this.data2.copyFrom(option);
    }
    /**
     * data3を返す。
     * @return data3
     * @throws NullPointerException data3の値が<code>null</code>である場合
     */
    public long getData3() {
        return this.data3.get();
    }
    /**
     * data3を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData3(long value) {
        this.data3.modify(value);
    }
    /**
     * <code>null</code>を許すdata3を返す。
     * @return data3
     */
    public LongOption getData3Option() {
        return this.data3;
    }
    /**
     * data3を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData3Option(LongOption option) {
        this.data3.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=original_data");
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", data1=");
        result.append(this.data1);
        result.append(", data2=");
        result.append(this.data2);
        result.append(", data3=");
        result.append(this.data3);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + keycode.hashCode();
        result = prime * result + data1.hashCode();
        result = prime * result + data2.hashCode();
        result = prime * result + data3.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        OriginalData other = (OriginalData) obj;
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.data1.equals(other.data1) == false) {
            return false;
        }
        if(this.data2.equals(other.data2) == false) {
            return false;
        }
        if(this.data3.equals(other.data3) == false) {
            return false;
        }
        return true;
    }
    @Override public void write(DataOutput out) throws IOException {
        keycode.write(out);
        data1.write(out);
        data2.write(out);
        data3.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        data1.readFields(in);
        data2.readFields(in);
        data3.readFields(in);
    }
}