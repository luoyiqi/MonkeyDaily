package com.taiihc.monkey_daily.Contracts;

import com.taiihc.monkey_daily.BasePresenter;
import com.taiihc.monkey_daily.BaseView;

import java.util.List;


public interface WelfareContract {

    interface Presenter extends BasePresenter{

    }
    interface View extends BaseView<Presenter>{
        void setRecAdapterData(List<String> urls);
        void setProcesseEnd(Boolean end);

    }
}
