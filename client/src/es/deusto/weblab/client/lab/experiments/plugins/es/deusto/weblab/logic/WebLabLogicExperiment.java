/*
* Copyright (C) 2005-2009 University of Deusto
* All rights reserved.
*
* This software is licensed as described in the file COPYING, which
* you should have received as part of this distribution.
*
* This software consists of contributions made by many individuals, 
* listed below:
*
* Author: Pablo Orduña <pablo@ordunya.com>
*
*/ 
package es.deusto.weblab.client.lab.experiments.plugins.es.deusto.weblab.logic;

import es.deusto.weblab.client.configuration.IConfigurationManager;
import es.deusto.weblab.client.lab.experiments.ExperimentBase;
import es.deusto.weblab.client.lab.experiments.plugins.es.deusto.weblab.logic.ui.WlDeustoLogicBasedBoard;
import es.deusto.weblab.client.lab.ui.BoardBase;
import es.deusto.weblab.client.lab.ui.BoardBase.IBoardBaseController;

public class WebLabLogicExperiment extends ExperimentBase {
	private final IConfigurationManager configurationManager;
	private final WlDeustoLogicBasedBoard board;
	
	public WebLabLogicExperiment(IConfigurationManager configurationManager, IBoardBaseController boardController){
		this.configurationManager = configurationManager;
		this.board = new WlDeustoLogicBasedBoard(
					this.configurationManager,
					boardController
				);
	}

	@Override
	public BoardBase getUI() {
		return this.board;
	}
}