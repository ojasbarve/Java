class Visionary {
    String ideaName;
    int marketSize;

    void setIdea(String ideaName, int marketSize) {
        this.ideaName = ideaName;
        this.marketSize = marketSize;
    }

    void showIdea() {
        System.out.println("Idea: " + ideaName);
        System.out.println("Market Size: " + marketSize);
    }
}

class Builder {
    String techStack;
    int teamSize;

    void setBuild(String techStack, int teamSize) {
        this.techStack = techStack;
        this.teamSize = teamSize;
    }

    void showBuild() {
        System.out.println("Tech Stack: " + techStack);
        System.out.println("Team Size: " + teamSize);
    }
}

public class Navigator {
    public static void main(String[] args) {

        Visionary v = new Visionary();
        Builder b = new Builder();

        if (args.length >= 4) {
            v.setIdea(args[0], Integer.parseInt(args[1]));
            b.setBuild(args[2], Integer.parseInt(args[3]));
        } else {
            v.setIdea("AI Study Planner", 500);
            b.setBuild("Java + React", 6);
        }

        v.showIdea();
        b.showBuild();

        Navigator n = new Navigator();
        n.showRole("Project Navigator");
    }

    void showRole(String role) {
        System.out.println("Role: " + role);
    }
}
