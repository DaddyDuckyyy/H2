public class WorkingHours {
    public static void main(String[] args){
        var allWorkingHours = 640;
        var workers = allWorkingHours/8;
        System.out.println("Всего работников в компании — "+(workers)+" человек.");
        workers += 94;
        System.out.println("Если в компании работает " +workers+ " человека, то между сотрудниками может быть поделено " +(allWorkingHours/workers)+ " часа работы");
    }
}
