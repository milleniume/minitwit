package com.minitwit.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by donovan on 09/04/2016.
 */
public class GravatarUtilTest {
    @Test
    public void testGravatarURL() {
        Assert.assertEquals("label test", "http://www.gravatar.com/avatar/92b2c15ef43b36093c8ee51d74654739?d=monsterid&s=48",
                GravatarUtil.gravatarURL("user008@email.com", "monsterid", 48));
    }
}