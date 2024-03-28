package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

//使用 AWS CDK（Cloud Development Kit）建立基礎架構的應用程式入口點
public class InfraApp {
    public static void main(final String[] args) {
        //創建一個新的 CDK 應用程式物件
        App app = new App();

        new InfraStack(app, "LambdaCDKStack", StackProps.builder()


                .build());
        //合成 CDK 應用程式並產生相應的雲端資源
        app.synth();
    }
}

