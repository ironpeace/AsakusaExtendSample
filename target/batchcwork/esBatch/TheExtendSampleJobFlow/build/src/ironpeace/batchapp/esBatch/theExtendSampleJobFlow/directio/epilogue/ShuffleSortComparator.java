package ironpeace.batchapp.esBatch.theExtendSampleJobFlow.directio.epilogue;
/**
 */
public final class ShuffleSortComparator extends com.asakusafw.runtime.io.util.ShuffleKey.AbstractOrderComparator {
    /**
     * Creates a new instance.
     */
    public ShuffleSortComparator() {
        super(ShuffleKey.class);
    }
}