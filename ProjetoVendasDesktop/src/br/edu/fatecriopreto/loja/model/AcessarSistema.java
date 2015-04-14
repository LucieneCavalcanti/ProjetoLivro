/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.model;

import java.util.List;

/**
 *
 * @author Luciene
 */
public interface AcessarSistema {
    public abstract boolean login();
    public abstract List<Permissao> verificarPermissoes();
    
}
