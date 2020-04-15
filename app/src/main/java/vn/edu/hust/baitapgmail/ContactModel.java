package vn.edu.hust.baitapgmail;

public class ContactModel {
    String fullname;
    String content;
    int avatarResource;
    boolean isSelected;
    boolean isLeft;

    public ContactModel(String fullname, int avatarResource, String content) {
        this.fullname = fullname;
        this.content=content;
        this.avatarResource = avatarResource;
        this.isSelected = false;
        this.isLeft = true;
    }

    public ContactModel(String fullname, int avatarResource, boolean isLeft, String content) {
        this.fullname = fullname;
        this.content = content;
        this.avatarResource = avatarResource;
        this.isLeft = isLeft;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
