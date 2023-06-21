public class Disk {
    // Задаем поля для класса Disk
    private String diskName;
    private String diskType;
    private String contentCategory;
    private String description;

    // Конструктор класса Disk
    public Disk(String diskName, String diskType, String contentCategory, String description) {
        this.diskName = diskName;
        this.diskType = diskType;
        this.contentCategory = contentCategory;
        this.description = description;
    }
    // Геттеры класса Disk
    public String getContentCategory() {
        return contentCategory;
    }
    public String getDiskName() {
        return diskName;
    }
    public String getDiskType() {
        return diskType;
    }
    public String getDescription() {
        return description;
    }
    // Сеттеры для класса Disk
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }
    public Disk setDiskType(String diskType) {
        this.diskType = diskType;
        return null;
    }
    public void setContentCategory(String contentCategory) {
        this.contentCategory = contentCategory;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
