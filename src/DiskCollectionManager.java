import java.util.List;
import java.util.ArrayList;

public class DiskCollectionManager {
    private List<Disk> disks;

    public DiskCollectionManager() {
        disks = new ArrayList<>();
    }
    //Метод добавления в коллекцию
    public void addDisk(String diskName, String diskType, String contentCategory, String description) {
        Disk disk = new Disk(diskName, diskType, contentCategory, description);
        disks.add(disk);
    }
    // Метод получения инфо о дисках
    public List<Disk> getAllDisks() {
        return disks;
    }
    //Метод удаления из коллекции по индексу
    public void removeDisk(int index) {
        disks.remove(index);
    }
    public Disk findDiskByName(String diskName) {
        for (Disk disk : disks) {
            if (disk.getDiskName().equals(diskName)){
                return disk;
            }
        }
        return null;
    }
}
