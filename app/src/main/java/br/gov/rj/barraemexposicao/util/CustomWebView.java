package br.gov.rj.barraemexposicao.util;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by yurifw on 15/05/14.
 */
public class CustomWebView extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        if (Uri.parse(url).getHost().equals("www.kweekdesign.com.br")) {
            return false;
        }
        return super.shouldOverrideUrlLoading(view, url);
    }

}
