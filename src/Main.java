import java.util.List;


public class Main {
    public static void main(String[] args) {
        DiskCollectionManager diskCollectionManager = new DiskCollectionManager();
        diskCollectionManager.addDisk("Властелин Колец. Братство кольца.", "DVD", "Кино", "Один из любимых фильмов детства.");
        diskCollectionManager.addDisk("Настоящий детектив", "CD-RW", "Сериалы", "Мрачный детектив.");
        diskCollectionManager.addDisk("Линкольн для адвоката", "DVD-R", "Кино", "Кино с Маконахи.");
        diskCollectionManager.addDisk("Windows 10 Pro", "DVD-R", "ПО", "Лицензионная Windows на 3 устройства.");
        diskCollectionManager.addDisk("Фото Выпускной 2015", "Flash", "Фото", "Фото с моего выпускного.");
        diskCollectionManager.addDisk("5 Fingers Death Punch", "CD", "Музыка", "Записи с концерта в Москве в 2020 году.");

        List<Disk> allDisk = diskCollectionManager.getAllDisks();
        for (Disk disk : allDisk) {
            System.out.println(disk.getDiskName() + " - " + disk.getDiskType() + " - " + disk.getContentCategory() + " - " + disk.getDescription());
        }
        System.out.println();


        diskCollectionManager.removeDisk(2);
        for (Disk disk : allDisk) {
            System.out.println(disk.getDiskName() + " - " + disk.getDiskType() + " - " + disk.getContentCategory() + " - " + disk.getDescription());
        }
        System.out.println();

        diskCollectionManager.findDiskByName("Windows 10 Pro").setDiskType("CD-R");
        diskCollectionManager.findDiskByName("Windows 10 Pro").setDescription("Лицензия DR.web");
        diskCollectionManager.findDiskByName("Windows 10 Pro").setContentCategory("ПО");
        diskCollectionManager.findDiskByName("Windows 10 Pro").setDiskName("Dr.web");

        for (Disk disk : allDisk) {
            System.out.println(disk.getDiskName() + " - " + disk.getDiskType() + " - " + disk.getContentCategory() + " - " + disk.getDescription());
        }



    }

}