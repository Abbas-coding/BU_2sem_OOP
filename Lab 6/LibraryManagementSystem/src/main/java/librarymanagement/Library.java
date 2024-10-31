package librarymanagement;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<LibraryBranch> branches;

    public Library(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBranch(LibraryBranch branch) {
        branches.add(branch);
    }

    public void displayBranches() {
        System.out.println("Branches of " + name + ":");
        for (LibraryBranch branch : branches) {
            System.out.println("- " + branch.getName());
        }
    }
}
