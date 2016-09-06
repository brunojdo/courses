package com.danielfireman.courses.map.wrappers;

import java.io.IOException;

/**
 * Exemplo da motivação para uso de wrappers.
 */
interface Imagem {
    /**
     * @return Altura da imagem em pixels.
     */
    short altura();

    /**
     * @return Largura da imagem em pixels.
     */
    short largura();

    /**
     * Desenha a imagem.
     */
    void draw() throws IOException;
}