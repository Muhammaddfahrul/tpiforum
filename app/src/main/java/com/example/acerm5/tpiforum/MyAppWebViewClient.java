package com.example.acerm5.tpiforum;
import  android.webkit.WebViewClient;
import android.webkit.WebView;
import android.net.Uri;
import android.content.Intent;
/**
 * Created by AcerM5 on 5/12/2015.
 */
public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        //if(Uri.parse(url).getHost().endsWith("html://forumtpi.appsot.com")) {
        if(Uri.parse(url).getHost().endsWith("html:/gforum-demo.appspot.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}