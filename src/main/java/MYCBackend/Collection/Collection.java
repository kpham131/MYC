package MYCBackend.Collection;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Collections")
public class Collection {
    @Id
    @Column(name = "collection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collectionID;

    @Column(name = "collection_name")
    private String collectionName;

    @Column(name = "designer")
    private String  designer;

    @Column(name = "collection_description")
    private String collectionDescription;

    @Column(name = "release_date")
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