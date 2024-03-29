package controller;

public class FacilityMenu extends DisplayMenu {
    public FacilityMenu() {
        super(new String[]{"Display list Facility","Add new Facility","Edit Facility","Return main menu"});
    }
    public void display(){
        System.out.println("----FACILITY MANAGEMENT-----");
        for (int i=0;i< options.length;i++){
            System.out.println((i+1)+"."+options[i]);
        }
    }
    public void handleChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Displaying list Facility");
                break;
            case 2:
                System.out.println("Adding new Facility");
                break;
            case 3:
                System.out.println("Editing Facility");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
