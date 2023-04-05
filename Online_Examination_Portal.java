package Examination.com;
import  java.util.Scanner;

class Reg {

	Scanner sc = new Scanner(System.in);
	Subject mn = new Subject();
	Login login = new Login();

	void A() {
		System.out.println("\n Enter Your Name :");

		String name = sc.next();

		System.out.println("\n Enter Your Email :");
		String Mail = sc.next();
		System.out.println("\n Enter Your Password :");
		int pp = sc.nextInt();
		System.out.println("\n   Registration  Succesfully   ");
		System.out.println("Now you can login!!");
		System.out.println("\n-----login------");
		login.m1();
		
		
	}
}

class St {
	void Display() {
		System.out.println("Name: kavya tripathi ");
		System.out.println("Mail: muskandwivedi833@gmail.com ");

	}
}

class Math {
	Scanner sc = new Scanner(System.in);

	public void m() {

		int count = 0;
		System.out.println("There are 5 question each question carreies 2 marks");
		System.out.println("\n question no.1   :");
		System.out.println("\n1 19+.......=42");
		System.out.println("\n A.23");
		System.out.println("B.61");
		System.out.println("C.0");
		System.out.println("D.42\n");
		int u1 = sc.nextInt();
		if (u1 == 2) {
			count++;
		}
		System.out.println("\n question no.2    :");
		System.out.println("how much is 90-19");

		System.out.println("A.71");
		System.out.println("B.109");
		System.out.println("C.89");
		System.out.println("none of these\n");
		int u2 = sc.nextInt();
		if (u2 == 3) {
			count++;
		}
		System.out.println("\n question no.3   :");
		System.out.println("\n 20 is divisible by");
		System.out.println("A. 1");
		System.out.println("B. 3");
		System.out.println("c. 7");
		System.out.println("D. none of these");
		int u3 = sc.nextInt();
		if (u3 == 4) {
			count++;
		}
		System.out.println("\n question no.4   :");
		System.out.println("\n what is the smallest three digit");
		System.out.println("A. 100");
		System.out.println("B. 999");
		System.out.println("c. 111");
		System.out.println("D. 101");
		int u4 = sc.nextInt();
		if (u4 == 5) {
			count++;
		}
		System.out.println("\n question no.5   :");
		System.out.println("\nhow much is 190-87+16");
		System.out.println("A. 103");
		System.out.println("B. 261");
		System.out.println("c. 87");
		System.out.println("D. 119");
		int u5 = sc.nextInt();
		if (u5 == 6) {
			count++;
		}
		if (count > 3) {
			System.out.println("\n your performance is too good");
		} else {
			if (count > 2 && count < 4) {
				System.out.println("your performance is not bad , all the best for next time ");
			}

			else {
				System.out.println("\n your performance is too bad !!");
			}
			System.out.println("\n--------------------------------------");
			System.out.println("your total score is :" + count);

		}
	}
}

class Physics {
	Scanner sc = new Scanner(System.in);

	void p() {
		int count = 0;
		System.out.println("There are 5 question each question carreies 2 marks");
		System.out.println("\n question no.1   :");
		System.out.println("\n The intertia of an object causes the object to");
		System.out.println("A. decrease this speed");
		System.out.println("B. increase this speed");
		System.out.println("c. resist any chance in the state of its motion");
		System.out.println("D. declerate due to the friction");
		int u1 = sc.nextInt();
		if (u1 == 2) {
			count++;
		}
		System.out.println("\n question no.2   :");
		System.out.println("\n which of the following is the SI unit of force");
		System.out.println("A.Kgm/s^2");
		System.out.println("B. Kgm/-s");
		System.out.println("c. Newton-metro");
		System.out.println("D. Newton");
		int u2 = sc.nextInt();
		if (u2 == 3) {
			count++;
		}
		System.out.println("\n question no.3   :");
		System.out.println("\n By accelerating the magnet inside the coil,the current in it");
		System.out.println("A. increase");
		System.out.println("B. decrease");
		System.out.println("c. remains constant");
		System.out.println("D. reverses");
		int u3 = sc.nextInt();
		if (u3 == 4) {
			count++;
		}
		System.out.println("\n question no.4   :");
		System.out.println("\n total number of magnetic field lines passing through an area is called");
		System.out.println("A. magnetic flux density");
		System.out.println("B. magnatic flux");
		System.out.println("c. e.m.f");
		System.out.println("D. voltage");
		int u4 = sc.nextInt();
		if (u4 == 5) {
			count++;
		}
		System.out.println("\n question no.5   :");
		System.out.println("\n E.M.F for a coil depends upon");
		System.out.println("A. the cross sectional area ");
		System.out.println("B. no. of turns of wire");
		System.out.println("c. the magnitude of magnatic flux density");
		System.out.println("D. all of above");

		int u5 = sc.nextInt();
		if (u5 == 6) {
			count++;
		}
		if (count > 3) {
			System.out.println("\n your performance is too good");
		} else {
			if (count > 2 && count < 4) {
				System.out.println("your performance is not bad , all the best for next time ");
			}

			else {
				System.out.println("\n your performance is too bad !!");
			}
			System.out.println("\n--------------------------------------");
			System.out.println("your total score is :" + count);

		}

	}

}

class Chemistry {
	Scanner sc = new Scanner(System.in);

	void ch() {
		int count = 0;
		System.out.println("There are 5 question each question carreies 2 marks");
		System.out.println("\n question no.1   :");
		System.out.println("\n which of the following compound is yieldedfrom the reduction of nintoalkanes");
		System.out.println("A. Amine");
		System.out.println("B. Acid");
		System.out.println("c. Diazo compounds");
		System.out.println("D. Alcohol");
		int u1 = sc.nextInt();
		if (u1 == 2) {
			count++;
		}
		System.out.println("\n question no.2    :");
		System.out.println("which of the following is neither an acid nor base");

		System.out.println("A. KCL");
		System.out.println("B. ch3oh");
		System.out.println("C. HcL");
		System.out.println("D ch3cooh\n");
		int u2 = sc.nextInt();
		if (u2 == 3) {
			count++;
		}
		System.out.println("\n question no.3   :");
		System.out.println("\n which of the following compoud os used to depress the central nervous system");
		System.out.println("A. idoform");
		System.out.println("B. DdT");
		System.out.println("c. Freon");
		System.out.println("D. cloroform");
		int u3 = sc.nextInt();
		if (u3 == 4) {
			count++;
		}
		System.out.println("\n question no.4   :");
		System.out.println("\n which of the following is the simplest member of organic compounds");
		System.out.println("A. Formic acid");
		System.out.println("B. Formaldehyde");
		System.out.println("c. methane");
		System.out.println("D. methanol");
		int u4 = sc.nextInt();
		if (u4 == 5) {
			count++;
		}
		System.out.println("\n question no.5   :");
		System.out.println("\n Hydrocarbons are organic compounds with elements-----");
		System.out.println("A. both hydrogen and carbon ");
		System.out.println("B. carbon");
		System.out.println("c. hydrogen");
		System.out.println("D. oxygen");

		int u5 = sc.nextInt();
		if (u5 == 6) {
			count++;
		}
		if (count > 3) {
			System.out.println("\n your performance is too good");
		} else {
			if (count > 2 && count < 4) {
				System.out.println("your performance is not bad , all the best for next time ");
			}

			else {
				System.out.println("\n your performance is too bad !!");
			}
			System.out.println("\n--------------------------------------");
			System.out.println("your total score is :" + count);
		}

	}
}

class Subject {
	Math mt = new Math();
	Physics ps = new Physics();
	Chemistry cm = new Chemistry();

	St s = new St();
	Scanner sc = new Scanner(System.in);

	public void r1() {
		System.out.println(" \n login succesful");

		System.out.println("\n1.My account \n2.Exam \n3.About \n4.Exit ");
		System.out.println("Enter your option");
		int os = sc.nextInt();
		if (os == 1) {
			s.Display();

			System.out.println("\n1.back    \n2.Exit");
			int g1 = sc.nextInt();
			if (g1 == 1) {
				r1();

			} else {
				return;

			}
		}
		if (os == 2) {
			System.out.println("\n1.Math \n2.Physics \n3.Chemistry");
			System.out.println("select the subject");
			int sub = sc.nextInt();

			if (sub == 1) {
				mt.m();

			} else if (sub == 2) {
				ps.p();
			} else if (sub == 3) {
				cm.ch();
			} else {
				System.out.println("choose the the correct one ");

				System.out.println("\n1.back    \n2.Exit");
				int g2 = sc.nextInt();
				if (g2 == 1) {
					r1();

				} else {
					return;

				}
			}

		}
		if (os == 3) {
			System.out.println("\n---Online Examination Portal----");
			System.out.println("\n1.back    \n2.Exit");
			int g2 = sc.nextInt();
			if (g2 == 1) {
				r1();

			} else {
				return;

			}
		}
	}
}

class Login {
	Scanner sc = new Scanner(System.in);

	public void m1() {
		Subject su = new Subject();
		int pass = 5444;
		System.out.println("Enter your mail");
		String email = sc.nextLine();
		String emailId = "muskandwivedi833@gmail.com";
		System.out.println(email);
		System.out.println("Enter your password");
		int p = sc.nextInt();
		System.out.println(p);

		if (pass == p && emailId.equals(email))
			su.r1();

		else {
			System.out.println("your entered mail and password incorrect");
		}
	}
}

class Online_Examination_Portal {

	public static void main(String[] args) {

		Login l1 = new Login();

		Reg r1 = new Reg();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Welcome to online examination portal");
		System.out.println("\n1.Login   \n2.Signup");
		System.out.println("\n Enter your option");
		int r = sc.nextInt();
		if (r == 1) {
			System.out.println("\n Welcome come back ");
			System.out.println("\n------login------ ");
			l1.m1();
		}

		else {
			System.out.println("\n------signup------ ");
			r1.A();
		}

	}
}
