
public class Salary_month {
   double

	// 급여 계산 로직
	public double calculateSalary(WorkInfo workInfo) {
	   double baseSalary = workInfo.getDayworktime() * count(work.getWorkdate()); // 정규 근무 시간에 대한 기본 임금

	    // 야간 근무 수당 계산 (기본 시급의 20%)
	    double nightAllowance = workInfo.getNighttime() * (workInfo.getHourlyRate() * 0.2);

	    // 주말 근무 수당 계산 (기본 시급의 50%)
	    double weekendAllowance = workInfo.getHolidayworktime() * (workInfo.getHourlyRate() * 0.5);

	    // 총 급여 계산
	    double totalSalary = baseSalary + nightAllowance + weekendAllowance;

	    return totalSalary;
	}

	}

}
