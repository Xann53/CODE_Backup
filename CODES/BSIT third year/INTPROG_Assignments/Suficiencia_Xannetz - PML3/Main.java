public class Main {
    public static void main(String[] args) {
        Mitsubishi MitOBJ = new Mitsubishi(5,"Outlander VRX 4WD",6);
        Honda HonOBJ = new Honda(9,"Honda BR-V",6);
        Ford ForOBJ = new Ford(7,"Ford Falcon",6);
        System.out.println(MitOBJ.GetName() + " is " + MitOBJ.GetAge() + " years old.\n"
        + MitOBJ.StartEngine() + "\n" + MitOBJ.Accelerate() + "\n" + MitOBJ.Brake());
        System.out.println("\n" + ForOBJ.GetName() + " is " + ForOBJ.GetAge() + " years old.\n"
        + ForOBJ.StartEngine() + "\n" + ForOBJ.Accelerate() + "\n" + ForOBJ.Brake());
        System.out.println("\n" + HonOBJ.GetName() + " is " + HonOBJ.GetAge() + " years old.\n"
        + HonOBJ.StartEngine() + "\n" + HonOBJ.Accelerate() + "\n" + HonOBJ.Brake());
    }
}