package appeng.api.storage;

/**
 * For {@link appeng.me.storage.CellInventoryHandler}(or FluidCellInventoryHandler in AE2FC) to easily get bytes
 * informations
 */
public interface ICellCacheRegistry {

    long getTotalBytes();

    long getFreeBytes();

    long getUsedBytes();

    long getTotalTypes();

    long getFreeTypes();

    long getUsedTypes();

    StorageChannel getCellType();

}
