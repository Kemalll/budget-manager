package uni.plovdiv.budgetmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="budget/expenditure")
public class ExpenditureController {

    @Autowired
    private BudgetManager budgetManager;

    @GetMapping()
    public String createExpenditure(@RequestParam(name = "value") double value, @RequestParam(name = "date") String date, @RequestParam(name = "isRecurring") boolean isRecurring) {
        if (!isRecurring) {
            budgetManager.addExpenditures(value);
        }
        return "Success";
    }

}
