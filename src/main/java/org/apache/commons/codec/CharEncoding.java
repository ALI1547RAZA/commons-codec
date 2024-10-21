/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Character encoding names required of every implementation of the Java platform.*
 * From the Java documentation for {@link Charset}:
 * <p>
 * <cite>Every implementation of the Java platform is required to support the following character encodings. Consult the
 * release documentation for your implementation to see if any other encodings are supported. Consult the release
 * documentation for your implementation to see if any other encodings are supported.</cite>
 * </p>
 *
 * <ul>
 * <li>{@code US-ASCII}<p>
 * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.</p></li>
 * <li>{@code ISO-8859-1}<p>
 * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.</p></li>
 * <li>{@code UTF-8}<p>
 * Eight-bit Unicode Transformation Format.</p></li>
 * <li>{@code UTF-16BE}<p>
 * Sixteen-bit Unicode Transformation Format, big-endian byte order.</p></li>
 * <li>{@code UTF-16LE}<p>
 * Sixteen-bit Unicode Transformation Format, little-endian byte order.</p></li>
 * <li>{@code UTF-16}<p>
 * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order
 * accepted on input, big-endian used on output.)</p></li>
 * </ul>
 *
 * This perhaps would best belong in the [lang] project. Even if a similar interface is defined in [lang], it is not
 * foreseen that [codec] would be made to depend on [lang].
 *
 * <p>
 * This class is immutable and thread-safe.
 * </p>
 *
 * @see Charset
 * @since 1.4
 */
public class CharEncoding {

    /**
     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String ISO_8859_1 = StandardCharsets.ISO_8859_1.name();

    /**
     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String US_ASCII = StandardCharsets.US_ASCII.name();

    /**
     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory initial byte-order mark
     * (either order accepted on input, big-endian used on output)
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String UTF_16 = StandardCharsets.UTF_16.name();

    /**
     * Sixteen-bit Unicode Transformation Format, big-endian byte order.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String UTF_16BE = StandardCharsets.UTF_16BE.name();

    /**
     * Sixteen-bit Unicode Transformation Format, little-endian byte order.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String UTF_16LE = StandardCharsets.UTF_16LE.name();

    /**
     * Eight-bit Unicode Transformation Format.
     * <p>
     * Every implementation of the Java platform is required to support this character encoding.
     * </p>
     *
     * @see Charset
     */
    public static final String UTF_8 = StandardCharsets.UTF_8.name();

}
