package model;

import com.sun.corba.se.spi.ior.ObjectId;

import java.util.Arrays;


public class Upload {


    private ObjectId _id;

    private byte[] file;
    private String fileName;
    private String uploadDate;
    private String uploadTime;
    private ObjectId projectId;

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public ObjectId getProjectId() {
        return projectId;
    }

    public void setProjectId(ObjectId projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "Upload [_id=" + _id + ", file=" + Arrays.toString(file) + ", fileName=" + fileName + ", uploadDate="
                + uploadDate + ", uploadTime=" + uploadTime + ", projectId=" + projectId + "]";
    }

}
