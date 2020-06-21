package javaGame;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class myKeyListener implements NativeKeyListener {
    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        }catch (Exception e){
        }
        GlobalScreen.addNativeKeyListener(new myKeyListener());
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent е) {
    }
    @Override
    public void nativeKeyPressed(NativeKeyEvent е) {
        System.out.println("\nнажимается " + NativeKeyEvent.getKeyText(е.getKeyCode()));
    }
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        // System.out.println("Выпущенный  " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }
}
