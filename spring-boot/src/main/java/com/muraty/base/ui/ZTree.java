package com.muraty.base.ui;

public class ZTree {
    private String  id;             // 节点id
    private String  pId;            // 父节点pId I必须大写
    private String  name;           // 节点名称
    private Boolean open = false;   // 是否展开树节点，默认不展开
    private Boolean isParent = false;//是否为父节点，默认不是

    public ZTree() {}

    public ZTree(String id, String pId, String name) {
        this.id = id;
        this.pId = pId;
        this.name = name;
    }

    public ZTree(String id, String pId, String name, Boolean open) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.open = open;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getpId() {return pId;}
    public void setpId(String pId) {this.pId = pId;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Boolean getOpen() {return open;}
    public void setOpen(Boolean open) {this.open = open;}

    public Boolean getIsParent() {return isParent;}
    public void setIsParent(Boolean isParent) {this.isParent = isParent;}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZTree zTree = (ZTree) o;

        if (!id.equals(zTree.id)) return false;
        if (!isParent.equals(zTree.isParent)) return false;
        if (!name.equals(zTree.name)) return false;
        if (!open.equals(zTree.open)) return false;
        if (!pId.equals(zTree.pId)) return false;

        return true;
    }

    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + pId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + open.hashCode();
        result = 31 * result + isParent.hashCode();
        return result;
    }
}



