package helloWorld.action;



import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import helloWorld.entity.FishingData;
import helloWorld.service.FishingDataService;
import helloWorld.form.FishingDataForm;

public class FishingDataAction {


    public List<FishingData> fishingDataItems;
    
    @ActionForm
    @Resource
    protected FishingDataForm fishingDataForm;

    @Resource
    protected FishingDataService fishingDataService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        fishingDataItems = fishingDataService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show/{date}/{fishCode}")
    public String show() {
        FishingData entity = fishingDataService.findById(fishingDataForm.date, fishingDataForm.fishCode);
        Beans.copy(entity, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false)
    public String cancel() {
        FishingData entity = fishingDataService.findById(fishingDataForm.date, fishingDataForm.fishCode);
        Beans.copy(entity, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit/{date}/{fishCode}")
    public String edit() {
        FishingData entity = fishingDataService.findById(fishingDataForm.date, fishingDataForm.fishCode);
        Beans.copy(entity, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete/{date}/{fishCode}", redirect = true)
    public String delete() {
        FishingData entity = Beans.createAndCopy(FishingData.class, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        fishingDataService.delete(entity);
        return "/fishingData/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        FishingData entity = Beans.createAndCopy(FishingData.class, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        fishingDataService.insert(entity);
        return "/fishingData/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        FishingData entity = Beans.createAndCopy(FishingData.class, fishingDataForm).dateConverter("yyyy-MM-dd").execute();
        fishingDataService.update(entity);
        return "/fishingData/";
    }
}