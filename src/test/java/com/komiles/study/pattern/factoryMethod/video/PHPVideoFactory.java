package com.komiles.study.pattern.factoryMethod.video;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:50
 */
public class PHPVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new PHPVideo();
    }
}
