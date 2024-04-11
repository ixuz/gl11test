package com.example;
import org.junit.Test;
import org.lwjgl.opengl.GL11;
import static org.mockito.Mockito.mockStatic;
public class JWJGLTest {
    @Test public void tryMockStaticGL11() { mockStatic(GL11.class); }
}
