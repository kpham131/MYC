package MYCBackend.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "Collections")
public class Collection {
    @Id
    @Column(name = "CollectionID")
    private int collectionID;

    @Column(name = "CollectionName")
    private String collectionName;

    @Column(name = "Designer")
    private String  designer;

    @Column(name = "CollectionDescription")
    private String collectionDescription;

    @Column(name = "ReleaseDate")
    private Date releaseDate;

    public Collection(int collectionID, String collectionName, String designer, String collectionDescription, Date releaseDate) {
        this.collectionID = collectionID;
        this.collectionName = collectionName;
        this.designer = designer;
        this.collectionDescription = collectionDescription;
        this.releaseDate = releaseDate;
    }

    public Collection() {
    }

    public int getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(int collectionID) {
        this.collectionID = collectionID;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getCollectionDescription() {
        return collectionDescription;
    }

    public void setCollectionDescription(String collectionDescription) {
        this.collectionDescription = collectionDescription;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collectionID=" + collectionID +
                ", collectionName='" + collectionName + '\'' +
                ", designer='" + designer + '\'' +
                ", collectionDescription='" + collectionDescription + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
