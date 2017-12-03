package projects.nyinyihtunlwin.news;

import android.app.Application;

import projects.nyinyihtunlwin.news.data.models.NewsModel;

/**
 * Created by Dell on 11/4/2017.
 */

public class SFCNewsApp extends Application {

    public static final String LOG_TAG = "SFCNewsApp";

    @Override
    public void onCreate() {
        super.onCreate();
        NewsModel.getInstance().startLoadingMMNews();
    }
}
