package quiz4a;

// 2.1 Manager สืบทอดจาก Employee (ใช้ extends Employee)Manager สืบทอดจาก Employee (ใช้ extends Employee)
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2Manager เป็น Subclass ของ Employee ใช้ subper เพื่อเรียก Constructor ของ Employee 
    //มีตัวแปรเพิ่มคือ department และ bonus ใช้ this.department = department; และ this.bonus = bonus; เพื่อกำหนดค่าให้ตัวแปรของ Manager
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;// สถานะเริ่มต้นเป็น department
        this.bonus = bonus;// สถานะเริ่มต้นเป็น bonus
    }

    // 2.3 เมทอด displayDetails() ใช้สำหรับแสดงรายละเอียดของพนักงาน โดยสร้างอาร์เรย์ details ที่เก็บข้อมูล เช่น รหัสพนักงาน ชื่อ เงินเดือน แผนก และโบนัส จากนั้นใช้ ลูป for-each เพื่อพิมพ์ข้อมูลทั้งหมดออก
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4 เมทอดนี้ใช้แสดงรายละเอียดของพนักงาน ถ้า condition เป็น "full" พิมพ์ข้อมูลทั้งหมด 
    //ถ้าเป็นค่าอื่น จะพิมพ์เฉพาะ Employee ID และ Nameใช้ String Array (details[]) เพื่อเก็บข้อมูล และใช้ loop เพื่อพิมพ์ข้อมูลออกมา ใช้ equalsIgnoreCase เพื่อเปรียบเทียบ string แบบไม่สนใจตัวพิมพ์เล็กเเละใหญ่
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
    

