package modele;

import java.util.ArrayList;
import java.util.List;

public class Model2 implements HasID{
    private Integer Model2ID;
    private String Model2Name;
    private String Region;
    private List<Model1> ListModel1inModel2;

    public Model2(Integer Model2ID, String Model2Name,String region) {
        this.Model2ID = Model2ID;
        this.Model2Name = Model2Name;
        this.Region = region;
        this.ListModel1inModel2 = new ArrayList<>();
        //this.ausgelieheneModel1e = ausgelieheneModel1e;
    }
    public Integer getModel2ID() {
        return Model2ID;
    }
    public void setModel2ID(Integer Model2ID) {
        this.Model2ID = Model2ID;
    }
    public String getModel2Name() {
        return Model2Name;
    }
    public void setModel2Name(String Model2Name) {
        this.Model2Name = Model2Name;
    }
    public List<Model1> getListModel1inModel2() {
        return ListModel1inModel2;
    }
    public void addModel1(Model1 Model1) {
        ListModel1inModel2.add(Model1);
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    @Override
    public String toString() {
        return "Model2{" +
                "Model2ID=" + Model2ID +
                ", Model2Name='" + Model2Name + '\'' +
                ", Region='" + Region + '\'' +
                ", ListModel1inModel2=" + ListModel1inModel2 +
                '}';
    }

    @Override
    public Integer getId() {
        return Model2ID;
    }
}
