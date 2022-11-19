public enum Branch {
    MATH(101),
    PHYSICS(102),
    GEOMETRY(103);

    private int fielId;
    Branch(int fielId){
        this.fielId = fielId;
    }

    public void showItems(Branch branch){
        Branch[] branches = Branch.values();
        for (Branch b:branches) {
            System.out.println(b);
        }
    }
}
