/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2023, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * https://www.carrot2.org/carrot2.LICENSE
 */
package org.carrot2.language.extras;

import java.io.IOException;

public class BulgarianLanguageComponentsTest extends AbstractLanguageComponentsTest {
  public BulgarianLanguageComponentsTest() throws IOException {
    super(
        BulgarianLanguageComponents.NAME,
        new String[] {"благодаря"},
        new String[][] {
          {"кризи", "криз"},
          {"градове", "град"}
        });
  }
}
