package br.gov.rj.barraemexposicao;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import br.gov.rj.barraemexposicao.util.CustomWebView;

public class Enquete extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquete);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new CustomWebView());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://www.kweekdesign.com.br/test/barraexpo");

    }

}
