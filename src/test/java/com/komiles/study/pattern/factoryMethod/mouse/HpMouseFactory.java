package com.komiles.study.pattern.factoryMethod.mouse;

/**
 * @author komiles@163.com
 * @date 2020-06-01 10:19
 */
public class HpMouseFactory implements MouseFactory {

    @Override
    public Mouse mouseCreate() {
        return new HpMouse();
    }
}
